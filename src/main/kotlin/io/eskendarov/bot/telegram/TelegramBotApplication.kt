package io.eskendarov.bot.telegram

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TelegramBotApplication

fun main(args: Array<String>) {
	runApplication<TelegramBotApplication>(*args)
}
