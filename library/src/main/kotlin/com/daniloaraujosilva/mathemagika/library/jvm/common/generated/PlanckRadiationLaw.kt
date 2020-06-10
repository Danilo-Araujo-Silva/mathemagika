package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PlanckRadiationLaw
 * 
 * Full name:        System`PlanckRadiationLaw
 * 
 *                   PlanckRadiationLaw[temperature, λ] returns the spectral radiance for the specified temperature and wavelength λ.
 *                   PlanckRadiationLaw[temperature, f] returns the spectral radiance for the specified temperature and frequency f.
 *                   PlanckRadiationLaw[temperature, property] returns the value of the property for the specified temperature.
 *                   PlanckRadiationLaw[temperature, {λ , λ }] returns the integrated result of the spectral radiance over the wavelength range λ  to λ .
 *                                                     1   2                                                                                     1     2
 *                   PlanckRadiationLaw[temperature, {f , f }] returns the integrated result of the spectral radiance over the frequency range f  to f .
 * Usage:                                              1   2                                                                                    1     2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PlanckRadiationLaw
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlanckRadiationLaw.html
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
fun planckRadiationLaw(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlanckRadiationLaw", arguments.toMutableList(), options)
}
