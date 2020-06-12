package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StereochemistryElements
 *
 * Full name:        System`StereochemistryElements
 *
 * Usage:            StereochemistryElements is an option for Molecule that specifies the local stereochemical arrangement of atoms in a molecule.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StereochemistryElements
 * Documentation:    web: http://reference.wolfram.com/language/ref/StereochemistryElements.html
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
fun stereochemistryElements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StereochemistryElements", arguments.toMutableList(), options)
}
