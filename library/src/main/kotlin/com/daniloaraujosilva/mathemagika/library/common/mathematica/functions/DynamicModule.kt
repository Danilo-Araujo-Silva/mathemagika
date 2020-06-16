package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DynamicModule
 *
 * Full name:        System`DynamicModule
 *
 *                   DynamicModule[{x, y, …}, expr] represents an object which maintains the same local instance of the symbols x, y, … in the course of all evaluations of Dynamic objects in expr. Symbols specified in a DynamicModule will by default have their values maintained even across Wolfram System sessions.
 *                   DynamicModule[{x = x , y = y , …}, expr] specifies initial values for x, y, ….
 * Usage:                                0       0
 *
 *                   BaseStyle -> {}
 *                   DefaultBaseStyle -> {}
 *                   Deinitialization :> None
 *                   DynamicModuleParent -> None
 *                   DynamicModuleValues -> Automatic
 *                   InheritScope -> False
 *                   Initialization :> None
 *                   SaveDefinitions -> False
 *                   SynchronousInitialization -> True
 *                   UndoTrackedVariables :> None
 *                   UnsavedVariables :> None
 * Options:          UntrackedVariables :> None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DynamicModule
 * Documentation:    web: http://reference.wolfram.com/language/ref/DynamicModule.html
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
fun dynamicModule(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DynamicModule", arguments.toMutableList(), options)
}
