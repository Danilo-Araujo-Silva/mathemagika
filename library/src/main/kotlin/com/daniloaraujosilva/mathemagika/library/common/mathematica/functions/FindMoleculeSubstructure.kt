package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindMoleculeSubstructure
 *
 * Full name:        System`FindMoleculeSubstructure
 *
 *                   FindMoleculeSubstructure[mol, patt] finds a mapping between the atom indices in mol and an occurrence of patt in mol.
 *                   FindMoleculeSubstructure[mol, patt, All] finds all occurrences of patt in mol and returns all mappings.
 * Usage:            FindMoleculeSubstructure[mol, patt, n] finds at most n mappings.
 *
 * Options:          Overlaps -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindMoleculeSubstructure
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindMoleculeSubstructure.html
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
fun findMoleculeSubstructure(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindMoleculeSubstructure", arguments.toMutableList(), options)
}
