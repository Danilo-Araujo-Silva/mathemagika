package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Mesh
 *
 * Full name:        System`Mesh
 *
 * Usage:            Mesh is an option for Plot3D, DensityPlot, and other plotting functions that specifies what mesh should be drawn.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Mesh
 * Documentation:    web: http://reference.wolfram.com/language/ref/Mesh.html
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
fun mesh(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Mesh", arguments.toMutableList(), options)
}
