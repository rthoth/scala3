package scala3.fp.io

import scala3.fp.Monad

given IOMonad: Monad[IO] with

  def flatMap[A, B](fa: IO[A])(f: A => IO[B]): IO[B] =
    fa match
      case sync: SyncIO[A] => sync.flatMap(f)
