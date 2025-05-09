package com.ravenl.htmlannotator.core.util

actual fun defaultLogger(level: Logger.Level): Logger {
    return Logger(proxy = object : Logger.Proxy {
        override fun v(tag: String, msg: String, tr: Throwable?) {
            println("[v]: $tag - $msg ${tr?.message} ")
        }

        override fun d(tag: String, msg: String, tr: Throwable?) {
            println("[d]: $tag - $msg ${tr?.message} ")
        }

        override fun i(tag: String, msg: String, tr: Throwable?) {
            println("[i]: $tag - $msg ${tr?.message} ")
        }

        override fun w(tag: String, msg: String, tr: Throwable?) {
            println("[w]: $tag - $msg ${tr?.message} ")
        }

        override fun e(tag: String, msg: String, tr: Throwable?) {
            println("[e]: $tag - $msg ${tr?.message} ")
        }

        override fun flush() {
        }
    })
}
