package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CommunityGraphPlot
 * 
 * Full name:        System`CommunityGraphPlot
 * 
 *                   CommunityGraphPlot[g] generates a plot showing the community structure of the graph g.
 *                   CommunityGraphPlot[g, {{v  , v  , …}, …}] generates a plot for the graph g with communities {v  , v  , …}, ….
 *                                            i    i                                                               i    i
 *                                             1    2                                                               1    2
 *                   CommunityGraphPlot[g, {…, w [{v  , …}], …}] generates a plot with highlighting features defined by the symbol wrappers w .
 *                                              j   i                                                                                        j
 *                                                   1
 *                   CommunityGraphPlot[{v    v  , v    v  , …}, …] generates a plot for a graph in which vertex v   is connected to vertex v  .
 *                                        i     j    i     j                                                        ik                         jk
 *                                         1     1    2     2
 * Usage:            CommunityGraphPlot[m, …] generates a plot for a graph represented by the adjacency matrix m.
 * 
 *                   AlignmentPoint -> Center
 *                   AnnotationRules -> {}
 *                   AspectRatio -> Automatic
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   CommunityBoundaryStyle -> Automatic
 *                   CommunityLabels -> Automatic
 *                   CommunityRegionStyle -> Automatic
 *                   ContentSelectable -> Automatic
 *                   DirectedEdges -> False
 *                   EdgeCapacity -> Automatic
 *                   EdgeCost -> Automatic
 *                   EdgeLabels -> None
 *                   EdgeLabelStyle -> Automatic
 *                   EdgeShapeFunction -> Automatic
 *                   EdgeStyle -> Automatic
 *                   EdgeWeight -> Automatic
 *                   Epilog -> {}
 *                   FormatType -> TraditionalForm
 *                   Frame -> False
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> None
 *                   FrameTicksStyle -> {}
 *                   GraphHighlight -> {}
 *                   GraphHighlightStyle -> Automatic
 *                   GraphStyle -> Automatic
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   LabelStyle -> {}
 *                   Method -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme -> Automatic
 *                   Prolog -> {}
 *                   Properties -> {}
 *                   RotateLabel -> True
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   VertexCapacity -> Automatic
 *                   VertexLabels -> None
 *                   VertexLabelStyle -> Automatic
 *                   VertexShape -> Automatic
 *                   VertexShapeFunction -> Automatic
 *                   VertexSize -> Automatic
 *                   VertexStyle -> Automatic
 * Options:          VertexWeight -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CommunityGraphPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/CommunityGraphPlot.html
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
fun communityGraphPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CommunityGraphPlot", arguments.toMutableList(), options)
}
