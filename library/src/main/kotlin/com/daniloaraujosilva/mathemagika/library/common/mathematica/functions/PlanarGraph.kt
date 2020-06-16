package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PlanarGraph
 *
 * Full name:        System`PlanarGraph
 *
 *                   PlanarGraph[{e , e , …}] yields a planar graph with edges e .
 *                                 1   2                                        j
 *                   PlanarGraph[{v , v , …}, {e , e , …}] yields a planar graph with vertices v  and edges e .
 *                                 1   2        1   2                                           i            j
 *                   PlanarGraph[{…, w [v ], …}, {…, w [e ], …}] yields a planar graph with vertex and edge properties defined by the symbolic wrappers w .
 *                                    i  i            j  j                                                                                               k
 *                   PlanarGraph[{v   v , …}] uses rules v   v  to specify a planar graph.
 * Usage:                          i    j                  i    j
 *
 *                   AlignmentPoint -> Center
 *                   AnnotationRules -> Automatic
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
 *                   Properties -> Automatic
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
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PlanarGraph
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlanarGraph.html
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
fun planarGraph(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlanarGraph", arguments.toMutableList(), options)
}
