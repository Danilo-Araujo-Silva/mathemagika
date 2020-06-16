package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Molecule
 *
 * Full name:        System`Molecule
 *
 *                   Molecule[{atom , atom , …}, {bond , bond , …}] represents a molecule with atoms atom  and bonds bond .
 *                                 1      2           1      2                                           i               i
 *                   Molecule["identifier"] gives the molecule corresponding to the specified chemical name or SMILES string.
 *                   Molecule[Entity["Chemical", entity]] gives a molecule corresponding to a chemical entity.
 *                   Molecule[ExternalIdentifier[…]] attempts to give a molecule corresponding to an external identifier.
 *                   Molecule[Molecule[…], {id , id , …}] gives a molecule containing only atoms with indices id , together with bonds between them.
 * Usage:                                     1    2                                                            i
 *
 *                   AtomCoordinates -> Automatic
 *                   AtomDiagramCoordinates -> Automatic
 *                   IncludeAromaticBonds -> True
 *                   IncludeHydrogens -> Automatic
 *                   MetaInformation -> <||>
 * Options:          StereochemistryElements -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Molecule
 * Documentation:    web: http://reference.wolfram.com/language/ref/Molecule.html
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
fun molecule(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Molecule", arguments.toMutableList(), options)
}
