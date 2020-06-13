package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AtomDiagramCoordinates
 *
 * Full name:        System`AtomDiagramCoordinates
 *
 * Usage:            AtomDiagramCoordinates is an option for Molecule and related functions that specifies the two-dimensional coordinates of the atoms.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AtomDiagramCoordinates
 * Documentation:    web: http://reference.wolfram.com/language/ref/AtomDiagramCoordinates.html
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
fun atomDiagramCoordinates(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AtomDiagramCoordinates", arguments.toMutableList(), options)
}
