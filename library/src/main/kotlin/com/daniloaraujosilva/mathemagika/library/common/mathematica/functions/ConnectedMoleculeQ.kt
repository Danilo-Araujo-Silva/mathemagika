package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ConnectedMoleculeQ
 *
 * Full name:        System`ConnectedMoleculeQ
 *
 * Usage:            ConnectedMoleculeQ[mol] returns True if the atoms in mol form are connected by bonds, and False otherwise.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConnectedMoleculeQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConnectedMoleculeQ.html
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
fun connectedMoleculeQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConnectedMoleculeQ", arguments.toMutableList(), options)
}
