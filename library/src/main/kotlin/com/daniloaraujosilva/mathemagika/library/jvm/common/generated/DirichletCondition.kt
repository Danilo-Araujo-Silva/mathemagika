package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DirichletCondition
 * 
 * Full name:        System`DirichletCondition
 * 
 * Usage:            DirichletCondition[beqn, pred] represents a Dirichlet boundary condition given by equation beqn, satisfied on the part of the boundary of the region given to NDSolve and related functions where pred is True.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/DirichletCondition
 * Documentation:    web: http://reference.wolfram.com/language/ref/DirichletCondition.html
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
fun dirichletCondition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DirichletCondition", arguments.toMutableList(), options)
}
