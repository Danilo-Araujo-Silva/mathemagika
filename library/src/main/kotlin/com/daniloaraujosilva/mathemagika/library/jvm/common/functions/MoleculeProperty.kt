package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MoleculeProperty
 *
 * Full name:        System`MoleculeProperty
 *
 *                   MoleculeProperty[pname] represents a property identified by pname for use in MoleculeValue.
 * Usage:            MoleculeProperty[{pname, item}] represents a property that applies to item within a molecule.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MoleculeProperty
 * Documentation:    web: http://reference.wolfram.com/language/ref/MoleculeProperty.html
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
fun moleculeProperty(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MoleculeProperty", arguments.toMutableList(), options)
}
