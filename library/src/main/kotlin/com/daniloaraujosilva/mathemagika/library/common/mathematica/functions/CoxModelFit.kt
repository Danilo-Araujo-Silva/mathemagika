package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CoxModelFit
 *
 * Full name:        System`CoxModelFit
 *
 *                   CoxModelFit[{e , …, e }] constructs a model of the baseline hazard h (t) for events times e .
 *                                 1      n                                              0                      i
 *                   CoxModelFit[{{{ξ  , …, ξ  }, …, {ξ   , …, ξ  }}, {e , …, e }}, {f , …, f }, {x , …, x }] constructs a Cox model of the form h (t) exp(β  f  + … + β  f ), where the f  depend on the x .
 * Usage:                            11      1p        n 1      np      1      n      1      m     1      p                                       0         1  1        m  m              i                k
 *
 *                                      19
 *                   ConfidenceLevel -> --
 *                                      20
 *                   ConfidenceRange -> All
 *                   ConfidenceTransform -> LogLog
 *                   Method -> Automatic
 *                   NominalVariables -> None
 *                   StrataVariables -> None
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CoxModelFit
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoxModelFit.html
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
fun coxModelFit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoxModelFit", arguments.toMutableList(), options)
}
