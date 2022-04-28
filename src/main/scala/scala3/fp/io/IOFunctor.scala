package scala3.fp.io

import scala3.fp.Functor

given IOFunctor: Functor[IO] with

  def map[A, B](fa: IO[A])(f: A => B): IO[B] = fa match
    case sync: SyncIO[A] => sync.map(f)