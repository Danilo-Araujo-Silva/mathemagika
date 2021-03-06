package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**                                                         \!                                        " is a recognized dictionary word.
 *````                                                       * Usage:            StyleBox["word", "TI"] *
 *                                                                                                       *                   IgnoreCase -> False
 * Name:             DictionaryWordQ                                                                     * Options:          Language :> $Language
 *                                                                                                       *
 * Full name:        System`DictionaryWordQ                                                              *                   Protected
 *                                                                                                       * Attributes:       ReadProtected
 *                   DictionaryWordQ["word"] tests whether "                                             *
                                                                                                         *                   local: paclet:ref/DictionaryWordQ
                                                                                                         * Documentation:    web: http://reference.wolfram.com/language/ref/DictionaryWordQ.html
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
fun dictionaryWordQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DictionaryWordQ", arguments.toMutableList(), options)
}
