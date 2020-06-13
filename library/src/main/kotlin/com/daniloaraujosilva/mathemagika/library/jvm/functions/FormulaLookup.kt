package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**                                                                                                                     \!                                         ".
 *````                                                                                                                   *                   StyleBox["query", "TI"] * Usage:            FormulaLookup["query", n] returns at most n results.
 *                                                                                                                                                                    *
 * Name:             FormulaLookup                                                                                                                                    *                   ExcludedPhysicalQuantities -> {}
 *                                                                                                                                                                    * Options:          RequiredPhysicalQuantities -> {}
 * Full name:        System`FormulaLookup                                                                                                                             *
 *                                                                                                                                                                    *                   Protected
 *                   FormulaLookup["query"] gives a list of the full names of formulas whose names are consistent with "                                              * Attributes:       ReadProtected
                                                                                                                                                                      *
                                                                                                                                                                      *                   local: paclet:ref/FormulaLookup
                                                                                                                                                                      * Documentation:    web: http://reference.wolfram.com/language/ref/FormulaLookup.html
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
fun formulaLookup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FormulaLookup", arguments.toMutableList(), options)
}
