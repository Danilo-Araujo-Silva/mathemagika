package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ShiftRegisterSequence
 *
 * Full name:        System`ShiftRegisterSequence
 *
 *                   ShiftRegisterSequence[n] gives a complete maximum-length sequence for a size n linear-feedback shift register.
 *                   ShiftRegisterSequence[{n, {tap , tap , …}}] gives the complete sequence for a linear-feedback shift register with size n and taps at positions tap .
 *                                                 1     2                                                                                                             i
 *                   ShiftRegisterSequence[poly] gives the sequence for a linear-feedback shift register with feedback polynomial poly.
 *                   ShiftRegisterSequence[{n, {tap , tap , …}, f}] gives the sequence for a shift register with feedback function f.
 *                                                 1     2
 *                   ShiftRegisterSequence[spec, s] gives the first s elements of the shift register sequence.
 * Usage:            ShiftRegisterSequence[spec, init, s] gives the shift register sequence starting from state init.
 *
 *                   Method -> Automatic
 * Options:          Modulus -> 2
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ShiftRegisterSequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShiftRegisterSequence.html
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
fun shiftRegisterSequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShiftRegisterSequence", arguments.toMutableList(), options)
}
