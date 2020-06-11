package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpectralLineData
 *
 * Full name:        System`SpectralLineData
 *
 *                   SpectralLineData[entity] gives the values of all known properties for an atomic state or state transition.
 *                   SpectralLineData[entity, property] gives the value of the specified property for the given entity.
 *                   SpectralLineData[quantity] returns the state transition with the closest wavelength or frequency specified.
 *                   SpectralLineData[class, quantity] returns the entity in the specified entity class with the closest wavelength or energy to the specified quantity.
 *                   SpectralLineData[spec, {quantity , quantity }] returns the entities in spec that fall within the range specified between quantity  and quantity .
 * Usage:                                            1          2                                                                                     1             2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpectralLineData
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpectralLineData.html
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
fun spectralLineData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpectralLineData", arguments.toMutableList(), options)
}
