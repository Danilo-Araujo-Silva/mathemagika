package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EntityStore
 *
 * Full name:        System`EntityStore
 *
 *                   EntityStore["type"] represents an empty entity store for entities of type "type".
 *                   EntityStore["type"  data] represents an entity store for entities of type "type" with properties and values defined by data.
 *                   EntityStore[{tspec , tspec , …}] represents an entity store for entities of multiple types.
 *                                     1       2
 *                   EntityStore[RelationalDatabase[…]] constructs an entity store from the schema of an external database.
 *                   EntityStore[{tspec , tspec , ...}, dbspec] constructs an entity store by mapping table names in the database specified by dbspec to types as specified by the tspec .
 * Usage:                              1       2                                                                                                                                        i
 *
 * Options:          Initialization :> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EntityStore
 * Documentation:    web: http://reference.wolfram.com/language/ref/EntityStore.html
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
fun entityStore(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EntityStore", arguments.toMutableList(), options)
}
