package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BondList
 *
 * Full name:        System`BondList
 *
 *                   BondList[mol] gives the list of bonds in the molecule mol.
 *                   BondList[mol, patt] gives the list of bonds in the molecule mol matching the atom pattern patt.
 * Usage:            BondList[mol, patt, "prop"] gives the value for the specified property of the bonds matching patt.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BondList
 * Documentation:    web: http://reference.wolfram.com/language/ref/BondList.html
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
fun bondList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BondList", arguments.toMutableList(), options)
}
