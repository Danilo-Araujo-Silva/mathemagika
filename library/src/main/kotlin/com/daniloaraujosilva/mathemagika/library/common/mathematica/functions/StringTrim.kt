package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**                                                                                       \!                                          ".
 *````                                                                                     *                   StyleBox["string", "TI"] * Usage:            StringTrim["string", patt] trims substrings matching patt from the beginning and end.
 *                                                                                                                                       *
 * Name:             StringTrim                                                                                                          *                   IgnoreCase -> False
 *                                                                                                                                       * Options:          MetaCharacters -> None
 * Full name:        System`StringTrim                                                                                                   *
 *                                                                                                                                       * Attributes:       Protected
 *                   StringTrim["string"] trims whitespace from the beginning and end of "                                               *
                                                                                                                                         *                   local: paclet:ref/StringTrim
                                                                                                                                         * Documentation:    web: http://reference.wolfram.com/language/ref/StringTrim.html
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
fun stringTrim(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringTrim", arguments.toMutableList(), options)
}
