package com.daniloaraujosilva.mathemagika.common.jvm

import kotlin.reflect.KClass

/**
 *
 */
@Suppress("UNCHECKED_CAST")
inline fun <reified Type> kotlinClass(): KClass<Any> = (Type::class as KClass<Any>)
