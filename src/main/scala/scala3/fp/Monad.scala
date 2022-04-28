package scala3.fp

trait Monad[F[_]]:

  def flatMap[A, B](fa: F[A])(f: A => F[B]): F[B]