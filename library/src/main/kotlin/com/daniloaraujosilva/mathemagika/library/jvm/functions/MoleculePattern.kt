package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MoleculePattern
 *
 * Full name:        System`MoleculePattern
 *
 *                   MoleculePattern[{atom , atom , … }, { bond , bond , … }] represents a molecule pattern with atoms atom  and bonds bond  for use in substructure searching.
 *                                        1      2             1      2                                                    i               i
 *                   MoleculePattern["smarts"] represents a molecule pattern from the input SMARTS pattern.
 *                   MoleculePattern[mol, {id , id , …}] returns a molecule pattern consisting of the atoms from mol with index id  and their connecting bonds.
 * Usage:                                    1    2                                                                               i
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MoleculePattern
 * Documentation:    web: http://reference.wolfram.com/language/ref/MoleculePattern.html
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
fun moleculePattern(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MoleculePattern", arguments.toMutableList(), options)
}
