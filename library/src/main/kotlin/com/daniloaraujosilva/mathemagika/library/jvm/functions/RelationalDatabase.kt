package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RelationalDatabase
 *
 * Full name:        System`RelationalDatabase
 *
 *                   RelationalDatabase[…] represents schema information about a relational database.
 *                   RelationalDatabase[db] gives the complete schema of the database referenced by db.
 *                   RelationalDatabase[{table  table , …}, db] gives schema information related to the tables table .
 * Usage:                                     1      2                                                              i
 *
 * Options:          IncludeRelatedTables -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RelationalDatabase
 * Documentation:    web: http://reference.wolfram.com/language/ref/RelationalDatabase.html
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
fun relationalDatabase(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RelationalDatabase", arguments.toMutableList(), options)
}
