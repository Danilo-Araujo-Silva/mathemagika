package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SystemModelPlot
 *
 * Full name:        System`SystemModelPlot
 *
 *                   SystemModelPlot[sim] shows default plots from the SystemModelSimulationData object sim.
 *                   SystemModelPlot[sim, "name"] shows model plot "name".
 *                   SystemModelPlot[sim, {v , v , …}] generates a plot of the variables v  in sim.
 *                                          1   2                                         i
 *                   SystemModelPlot[{sim , sim , …}, …] plots variables from several simulations.
 *                                       1     2
 * Usage:            SystemModelPlot[model, …] plots from a new simulation of "model".
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemModelPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemModelPlot.html
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
 * Default value:    Options[SystemModelPlot] := SortBy[Join[Replace[Options[ListLinePlot], {HoldPattern[PlotLegends -> None] -> PlotLegends -> Automatic, HoldPattern[AxesLabel -> None] -> AxesLabel -> Automatic, HoldPattern[FrameLabel -> None] -> FrameLabel -> Automatic, HoldPattern[MeshStyle -> Automatic] -> MeshStyle -> Directive[PointSize[Medium], Red]}, {1}], {"PlotFunction" -> Automatic}], ToString[#1[[1]]] & ]
 *
 * Numeric values:   None
 */
fun systemModelPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemModelPlot", arguments.toMutableList(), options)
}
