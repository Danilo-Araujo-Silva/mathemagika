package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PeronaMalikFilter
 * 
 * Full name:        System`PeronaMalikFilter
 * 
 *                   PeronaMalikFilter[image] applies a Perona–Malik diffusion filter to image.
 *                   PeronaMalikFilter[image, t] specifies the amount of diffusion time t to be applied. 
 *                   PeronaMalikFilter[image, t, k] uses a conductance parameter k.
 * Usage:            PeronaMalikFilter[image, t, k, σ] applies a Gaussian regularization of width σ to the image gradient in the conductance function.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PeronaMalikFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/PeronaMalikFilter.html
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
fun peronaMalikFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PeronaMalikFilter", arguments.toMutableList(), options)
}
