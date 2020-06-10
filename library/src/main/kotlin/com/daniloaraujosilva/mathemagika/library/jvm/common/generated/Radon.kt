package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Radon
 * 
 * Full name:        System`Radon
 * 
 *                   Radon[image] gives an image representing the discrete Radon transform of image.
 *                   Radon[image, {w, h}] specifies the width w and the height h of the resulting image.
 *                   Radon[image, {w, h}, {θ , θ }] computes the Radon transform only for angles from θ  to θ .
 * Usage:                                   1   2                                                      1     2
 * 
 * Options:          Method -> Radon
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Radon
 * Documentation:    web: http://reference.wolfram.com/language/ref/Radon.html
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
fun radon(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Radon", arguments.toMutableList(), options)
}
