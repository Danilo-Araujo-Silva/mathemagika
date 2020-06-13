package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WignerD
 *
 * Full name:        System`WignerD
 *
 *                                                                              j
 *                   WignerD[{j, m , m }, ψ, θ, ϕ] gives the Wigner D-function D      (ψ, θ, ϕ).
 *                                1   2                                         m , m
 *                                                                               1   2
 *                                                                           j
 *                   WignerD[{j, m , m }, θ, ϕ] gives the Wigner D-function D      (0, θ, ϕ).
 *                                1   2                                      m , m
 *                                                                            1   2
 *                                                                        j
 *                   WignerD[{j, m , m }, θ] gives the Wigner D-function D      (0, θ, 0).
 *                                1   2                                   m , m
 * Usage:                                                                  1   2
 *
 * Options:          None
 *
 *                   NHoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WignerD
 * Documentation:    web: http://reference.wolfram.com/language/ref/WignerD.html
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
fun wignerD(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WignerD", arguments.toMutableList(), options)
}
