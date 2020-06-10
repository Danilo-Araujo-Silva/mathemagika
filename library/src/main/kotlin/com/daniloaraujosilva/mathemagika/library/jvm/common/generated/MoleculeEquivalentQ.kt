package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MoleculeEquivalentQ
 * 
 * Full name:        System`MoleculeEquivalentQ
 * 
 *                   MoleculeEquivalentQ[mol , mol ] gives True if mol  and mol  represent equivalent molecules and gives False otherwise.
 * Usage:                                   1     2                   1        2
 * 
 * Options:
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MoleculeEquivalentQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/MoleculeEquivalentQ.html
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
fun moleculeEquivalentQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MoleculeEquivalentQ", arguments.toMutableList(), options)
}
