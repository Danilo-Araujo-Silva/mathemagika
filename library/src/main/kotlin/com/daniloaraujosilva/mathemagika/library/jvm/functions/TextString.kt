package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TextString
 *
 * Full name:        System`TextString
 *
 * Usage:            TextString[expr] gives a human-readable string representation of expr.
 *
 *                   AssociationFormat -> Automatic
 *                   BooleanStrings -> {True, False}
 *                   DateFormat :> $DateStringFormat
 *                   ElidedForms -> Automatic
 *                   ListFormat -> Automatic
 *                   MissingString ->
 *                   TimeFormat -> Automatic
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TextString
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextString.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun textString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextString", arguments.toMutableList(), options)
}
