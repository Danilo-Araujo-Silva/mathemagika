package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PalindromeQ
 *
 * Full name:        System`PalindromeQ
 *
 *                   PalindromeQ[list] returns True if the given list is identical to Reverse[list], and False otherwise.
 *                   PalindromeQ[n] returns True if the integer n is identical to IntegerReverse[n], and False otherwise.
 * Usage:            PalindromeQ[string] returns True if the given string is identical to StringReverse[string], and False otherwise.
 *
 *                   IgnoreCase -> False
 *                   IgnoreDiacritics -> False
 * Options:          Language :> $Language
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PalindromeQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PalindromeQ.html
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
fun palindromeQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PalindromeQ", arguments.toMutableList(), options)
}
