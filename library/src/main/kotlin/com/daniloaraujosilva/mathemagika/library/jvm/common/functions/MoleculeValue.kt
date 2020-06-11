package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MoleculeValue
 *
 * Full name:        System`MoleculeValue
 *
 *                   MoleculeValue[molecule, property] gives the value of the specified property for the given molecule.
 *                   MoleculeValue[{molecule , molecule , …}, property] gives the list of values for the specified property for each of the molecule .
 *                                          1          2                                                                                            i
 *                   MoleculeValue[molecule, {property , property , …}] gives the list of values of the property  for the specified molecule.
 *                                                    1          2                                              i
 *                   MoleculeValue[molecule, {property, item}] gives the value of the specified property for item in molecule.
 *                   MoleculeValue[{molecule , molecule , …}, {property , property , …}] gives the list of values of the property  for each of the molecule .
 * Usage:                                   1          2               1          2                                              i                         i
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MoleculeValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/MoleculeValue.html
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
fun moleculeValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MoleculeValue", arguments.toMutableList(), options)
}
