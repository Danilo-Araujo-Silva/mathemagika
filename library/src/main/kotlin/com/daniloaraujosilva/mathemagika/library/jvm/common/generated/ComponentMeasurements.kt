package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ComponentMeasurements
 * 
 * Full name:        System`ComponentMeasurements
 * 
 *                   ComponentMeasurements[{image, lmat}, "prop"] computes the property "prop" for components of image indicated by the label matrix lmat.
 *                   ComponentMeasurements[image, "prop"] computes the property "prop" for connected components of image. 
 *                   ComponentMeasurements[…, "prop", crit] only returns measurements for components that satisfy the criterion crit.
 * Usage:            ComponentMeasurements[…, "prop", crit, format] formats the result according to the output specification format.
 * 
 * Options:          CornerNeighbors -> True
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ComponentMeasurements
 * Documentation:    web: http://reference.wolfram.com/language/ref/ComponentMeasurements.html
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
fun componentMeasurements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ComponentMeasurements", arguments.toMutableList(), options)
}
