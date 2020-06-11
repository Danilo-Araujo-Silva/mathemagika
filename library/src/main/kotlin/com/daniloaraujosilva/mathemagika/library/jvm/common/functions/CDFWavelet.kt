package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                             \!                                        ".
 *````                                                                                           * Usage:            StyleBox["type", "TI"] *
 *                                                                                                                                           * Options:          None
 * Name:             CDFWavelet                                                                                                              *
 *                                                                                                                                           *                   Protected
 * Full name:        System`CDFWavelet                                                                                                       * Attributes:       ReadProtected
 *                                                                                                                                           *
 *                   CDFWavelet[] represents a Cohen–Daubechies–Feauveau wavelet of type "9/7".                                              *                   local: paclet:ref/CDFWavelet
 *                   CDFWavelet["type"] represents a Cohen–Daubechies–Feauveau wavelet of type "                                             * Documentation:    web: http://reference.wolfram.com/language/ref/CDFWavelet.html
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
fun cDFWavelet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CDFWavelet", arguments.toMutableList(), options)
}
