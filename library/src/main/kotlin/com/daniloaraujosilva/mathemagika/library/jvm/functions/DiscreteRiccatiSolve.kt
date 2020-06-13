package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteRiccatiSolve
 *
 * Full name:        System`DiscreteRiccatiSolve
 *
 *                                                                                                                                                                        †                            †                                                                                                                                     †
 *                   DiscreteRiccatiSolve[{a, b}, {q, r}] gives the matrix x that is the stabilizing solution of the discrete algebraic Riccati equation RowBox[{RowBox[{a  . x . a, -, x, -, RowBox[{a , ., x, ., b, ., SuperscriptBox[RowBox[{(, RowBox[{r, +, RowBox[{TemplateBox[{b}, ConjugateTranspose], ., x, ., b}]}], )}], -1], ., b , ., x, ., a}], +, q}], , 0}].
 *                                                                                   †                             †                                                                                                                                       †            †
 * Usage:            DiscreteRiccatiSolve[{a, b}, {q, r, p}] solves RowBox[{RowBox[{a  . x . a, -, x, -, RowBox[{(a  . x . b + p), ., SuperscriptBox[RowBox[{(, RowBox[{r, +, RowBox[{TemplateBox[{b}, ConjugateTranspose], ., x, ., b}]}], )}], -1], ., (b  . x . a + p )}], +, q}], , 0}].
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DiscreteRiccatiSolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteRiccatiSolve.html
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
fun discreteRiccatiSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteRiccatiSolve", arguments.toMutableList(), options)
}
