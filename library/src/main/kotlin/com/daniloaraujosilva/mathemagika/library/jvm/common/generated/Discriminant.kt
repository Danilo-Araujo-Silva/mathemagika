package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Discriminant
 * 
 * Full name:        System`Discriminant
 * 
 *                   Discriminant[poly, var] computes the discriminant of the polynomial poly with respect to the variable var.
 * Usage:            Discriminant[poly, var, Modulus  p] computes the discriminant modulo p.
 * 
 *                   Method -> Automatic
 * Options:          Modulus -> 0
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Discriminant
 * Documentation:    web: http://reference.wolfram.com/language/ref/Discriminant.html
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
fun discriminant(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Discriminant", arguments.toMutableList(), options)
}
