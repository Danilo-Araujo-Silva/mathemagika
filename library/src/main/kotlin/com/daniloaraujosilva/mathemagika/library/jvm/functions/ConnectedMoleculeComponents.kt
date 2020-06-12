package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConnectedMoleculeComponents
 *
 * Full name:        System`ConnectedMoleculeComponents
 *
 * Usage:            ConnectedMoleculeComponents[mol] gives the connected components of the molecule mol.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConnectedMoleculeComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConnectedMoleculeComponents.html
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
fun connectedMoleculeComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConnectedMoleculeComponents", arguments.toMutableList(), options)
}
