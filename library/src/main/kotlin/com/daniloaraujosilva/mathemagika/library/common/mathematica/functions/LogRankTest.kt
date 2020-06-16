package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**                                                                                                                          \!                                            ".
 *````                                                                                                                        *                                    1          *
 *                                                                                                                            * Usage:            StyleBox["property", "TI"] *                   Method -> Automatic
 * Name:             LogRankTest                                                                                                                                              *                                        1
 *                                                                                                                                                                            *                   SignificanceLevel -> --
 * Full name:        System`LogRankTest                                                                                                                                       * Options:                               20
 *                                                                                                                                                                            *
 *                   LogRankTest[{data , data , …}] tests for equal hazard rates among the data  using a log-rank type test.                                                  *                   Protected
 *                                    1      2                                                 i                                                                              * Attributes:       ReadProtected
 *                   LogRankTest[{data , data , …}, wspec] performs a weighted log-rank test with weights wspec.                                                              *
 *                                    1      2                                                                                                                                *                   local: paclet:ref/LogRankTest
 *                   LogRankTest[{data , …}, wspec, "property"] returns the value of "                                                                                        * Documentation:    web: http://reference.wolfram.com/language/ref/LogRankTest.html
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
fun logRankTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LogRankTest", arguments.toMutableList(), options)
}
