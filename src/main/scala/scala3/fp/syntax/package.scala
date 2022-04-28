package scala3.fp.syntax

import scala3.fp.{Functor, Monad, ToShow, StringToShow}

//noinspection ScalaFileName
given Conversion[String, ToShow] with
  def apply(string: String) = StringToShow(string)

extension[A, F[_]] (using Monad[F])(fa: F[A])

  def flatMap[B](f: A => F[B]): F[B] = summon[Monad[F]].flatMap(fa)(f)

extension[A, F[_]] (using Functor[F])(fa: F[A])

  def map[B](f: A => B): F[B] = summon[Functor[F]].map(fa)(f)