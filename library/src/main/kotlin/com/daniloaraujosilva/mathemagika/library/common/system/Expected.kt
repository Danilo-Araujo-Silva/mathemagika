package com.daniloaraujosilva.mathemagika.library.common.system

/**
 *
 */
expect fun executeSystemCommand(commands: List<String>): String

/**
 *
 */
expect fun getEnvironmentVariable(candidates: List<String>, default: String? = null): String?

/**
 *
 */
expect fun getProperty(candidates: List<String>, default: String? = null): String?
