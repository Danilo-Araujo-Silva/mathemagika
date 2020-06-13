package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MoleculeModify
 *
 * Full name:        System`MoleculeModify
 *
 *                   MoleculeModify[mol, "mod"] gives a molecule or list of molecules derived from the molecule mol by applying the modification "mod".
 *                   MoleculeModify[mol, {"mod", specs}] gives a molecule or list of molecules derived from the molecule mol by applying the modification "mod" with additional specifications specs.
 * Usage:            MoleculeModify["mod"] represents an operator form of MoleculeModify that can be applied to a molecule.
 *
 *                   Method -> Automatic
 * Options:          ValenceErrorHandling -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MoleculeModify
 * Documentation:    web: http://reference.wolfram.com/language/ref/MoleculeModify.html
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
fun moleculeModify(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MoleculeModify", arguments.toMutableList(), options)
}
