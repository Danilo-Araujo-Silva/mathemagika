package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SystemsConnectionsModel
 * 
 * Full name:        System`SystemsConnectionsModel
 * 
 *                   SystemsConnectionsModel[{sys , sys , …}, conxs, ins, outs] gives a model with inputs ins and outputs outs obtained by connecting the systems models sys  using connections conxs.
 * Usage:                                        1     2                                                                                                                    i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SystemsConnectionsModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsConnectionsModel.html
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
fun systemsConnectionsModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsConnectionsModel", arguments.toMutableList(), options)
}
