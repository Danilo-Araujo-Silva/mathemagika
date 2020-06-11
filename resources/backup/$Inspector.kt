package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             (Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) &
 *
 * Full name:        Information[(Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) & , FullName]
 *
 * Usage:            Information[(Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) & , Usage]
 *
 * Options:          Information[(Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) & , Options]
 *
 * Attributes:       Information[(Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) & , Attributes]
 *
 *                   local: <>Information[(Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) & , Documentation][Local]
 * Documentation:    web: <>Information[(Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) & , Documentation][Web]
 *
 * Definitions:      Information[(Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) & , Definitions]
 *
 * Own values:       Information[(Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) & , OwnValues]
 *
 * Down values:      Information[(Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) & , DownValues]
 *
 * Up values:        Information[(Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) & , UpValues]
 *
 * Sub values:       Information[(Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) & , SubValues]
 *
 * Default value:    Information[(Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) & , DefaultValues]
 *
 * Numeric values:   Information[(Message[Interrupt::dgbgn]; Dialog[]; Message[Interrupt::dgend]) & , NValues]
 */
fun `$Inspector`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$Inspector", arguments.toMutableList(), options)
}
