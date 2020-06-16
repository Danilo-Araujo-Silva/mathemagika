package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PetersenGraph
 *
 * Full name:        System`PetersenGraph
 *
 *                   PetersenGraph[n, k] gives the generalized Petersen graph P    .
 * Usage:                                                                      n, k
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
 *                   ContentSelectable -> Automatic
 *                   DirectedEdges -> Automatic
 *                   EdgeCapacity -> Automatic
 *                   EdgeCost -> Automatic
 *                   EdgeLabels -> None
 *                   EdgeLabelStyle -> Automatic
 *                   EdgeShapeFunction -> Automatic
 *                   EdgeStyle -> Automatic
 *                   EdgeWeight -> Automatic
 *                   Editable -> False
 *                   Epilog -> {}
 *                   FormatType -> TraditionalForm
 *                   Frame -> False
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> None
 *                   FrameTicksStyle -> {}
 *                   GraphHighlight -> {}
 *                   GraphHighlightStyle -> Automatic
 *                   GraphLayout -> Automatic
 *                   GraphRoot -> Automatic
 *                   GraphStyle -> Automatic
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   LabelStyle -> {}
 *                   PerformanceGoal -> Automatic
 *                   PlotLabel -> None
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
 *                   VertexCoordinates -> Automatic
 *                   VertexLabels -> None
 *                   VertexLabelStyle -> Automatic
 *                   VertexShape -> Automatic
 *                   VertexShapeFunction -> Automatic
 *                   VertexSize -> Automatic
 *                   VertexStyle -> Automatic
 * Options:          VertexWeight -> Automatic
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PetersenGraph
 * Documentation:    web: http://reference.wolfram.com/language/ref/PetersenGraph.html
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
fun petersenGraph(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PetersenGraph", arguments.toMutableList(), options)
}
