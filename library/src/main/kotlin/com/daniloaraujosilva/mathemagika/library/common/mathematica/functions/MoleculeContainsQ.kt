package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MoleculeContainsQ
 *
 * Full name:        System`MoleculeContainsQ
 *
 *                   MoleculeContainsQ[molecule, patt] returns True if patt is a substructure of molecule, and False otherwise.
 * Usage:            MoleculeContainsQ[patt] represents an operator form of MoleculeContainsQ that can be applied to a molecule.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MoleculeContainsQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/MoleculeContainsQ.html
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
fun moleculeContainsQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MoleculeContainsQ", arguments.toMutableList(), options)
}
