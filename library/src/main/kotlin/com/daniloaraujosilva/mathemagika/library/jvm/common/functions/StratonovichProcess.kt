package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StratonovichProcess
 *
 * Full name:        System`StratonovichProcess
 *
 *                   StratonovichProcess[{a, b}, x, t] represents a Stratonovich process x(t), where  x(t)  a(t, x(t))  t + b(t, x(t)) ◦  w(t) .
 *                   StratonovichProcess[{a, b, c}, x, t] represents a Stratonovich process y(t)  c(t, x(t)), where  x(t)  a(t, x(t))  t + b(t, x(t)) ◦  w(t) .
 *                   StratonovichProcess[…, …, {x, x }, {t, t }] represents a Stratonovich process with initial condition x(t )  x .
 *                                                  0        0                                                               0     0
 *                   StratonovichProcess[…, …, …, Σ] uses a Wiener process w(t), with covariance Σ.
 *                   StratonovichProcess[proc] converts proc to a standard Stratonovich process whenever possible.
 * Usage:            StratonovichProcess[sdeqns, expr, x, t, w  dproc] represents a Stratonovich process specified by a stochastic differential equation sdeqns, output expression expr, with state x and time t, driven by w following the process dproc.
 *
 * Options:          Assumptions :> $Assumptions
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StratonovichProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/StratonovichProcess.html
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
fun stratonovichProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StratonovichProcess", arguments.toMutableList(), options)
}
