package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Compile
 *
 * Full name:        System`Compile
 *
 *                   Compile[{x , x , …}, expr] creates a compiled function that evaluates expr assuming numerical values of the x .
 *                             1   2                                                                                              i
 *                   Compile[{{x , t }, …}, expr] assumes that x  is of a type that matches t .
 *                              1   1                           i                            i
 *                   Compile[{{x , t , n }, …}, expr] assumes that x  is a rank n  array of objects, each of a type that matches t .
 *                              1   1   1                           i            i                                                i
 *                   Compile[vars, expr, {{p , pt }, …}] assumes that subexpressions in expr that match p  are of types that match pt .
 * Usage:                                   1    1                                                       i                           i
 *
 *                   CompilationOptions -> Automatic
 *                   CompilationTarget :> $CompilationTarget
 *                   Parallelization -> Automatic
 *                   RuntimeAttributes -> {}
 * Options:          RuntimeOptions -> Automatic
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Compile
 * Documentation:    web: http://reference.wolfram.com/language/ref/Compile.html
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
fun compile(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Compile", arguments.toMutableList(), options)
}
