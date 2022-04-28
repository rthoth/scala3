package scala3.fp.io

import scala3.fp.ToShow

import scala.io.StdIn

class ReadLineIO(message: ToShow) extends SyncIO[String] :

  override def flatMap[B](f: String => IO[B]): IO[B] =
    Console.println(message.toShow)
    f(StdIn.readLine())


class PrintLineIO(message: ToShow) extends SyncIO[Unit] :

  override def flatMap[B](f: Unit => IO[B]): IO[B] =
    Console.println(message.toShow)
    f(())