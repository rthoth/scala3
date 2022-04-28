package scala3.fp.io

import scala3.fp.ToShow

import scala.io.StdIn

sealed trait IO[+A]

object IO {

  def readLine(message: ToShow): IO[String] = ReadLineIO(message)

  def printLine(message: ToShow): IO[Unit] = PrintLineIO(message)
}

trait SyncIO[A] extends IO[A] :

  def map[B](f: A => B): IO[B] =
    flatMap(a => Pure(f(a)))

  def flatMap[B](f: A => IO[B]): IO[B]

class Pure[E, A](value: A) extends SyncIO[A] :

  override def flatMap[B](f: A => IO[B]): IO[B] = f(value)
