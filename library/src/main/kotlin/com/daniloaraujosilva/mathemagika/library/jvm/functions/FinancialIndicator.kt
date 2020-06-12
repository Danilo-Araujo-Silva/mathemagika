package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                             \!                                                     " with parameters par , par , etc.
 *````                                                                                           *                                                1     2 * Usage:                                                       1     2
 *                                                                                               *                   StyleBox["ind", "TI"]               *
 * Name:             FinancialIndicator                                                                                                                   * Options:          None
 *                                                                                                                                                        *
 * Full name:        System`FinancialIndicator                                                                                                            *                   Protected
 *                                                                                                                                                        * Attributes:       ReadProtected
 *                   FinancialIndicator["ind", par , par , …] represents a financial indicator "                                                          *
                                                                                                                                                          *                   local: paclet:ref/FinancialIndicator
                                                                                                                                                          * Documentation:    web: http://reference.wolfram.com/language/ref/FinancialIndicator.html
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
fun financialIndicator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FinancialIndicator", arguments.toMutableList(), options)
}
