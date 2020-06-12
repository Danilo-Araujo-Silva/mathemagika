package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                                          \!SubscriptBox[                          " in StringExpression.
 *````                                                                                                        *                                  1     2 *                   DatePattern[{"e ", "e ", …}, sep] allows separators that match the string expression sep.
 *                                                                                                            *                   StyleBox["e", "TI"],   * Usage:                           1     2
 * Name:             DatePattern                                                                              *                   StyleBox["i", "TI"]]  *
 *                                                                                                                                                       * Options:          None
 * Full name:        System`DatePattern                                                                                                                  *
 *                                                                                                                                                       *                   Protected
 *                   DatePattern[{"e ", "e ", …}] represents the characters of a date with elements of type "                                            * Attributes:       ReadProtected
                                                                                                                                                         *
                                                                                                                                                         *                   local: paclet:ref/DatePattern
                                                                                                                                                         * Documentation:    web: http://reference.wolfram.com/language/ref/DatePattern.html
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
fun datePattern(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DatePattern", arguments.toMutableList(), options)
}
