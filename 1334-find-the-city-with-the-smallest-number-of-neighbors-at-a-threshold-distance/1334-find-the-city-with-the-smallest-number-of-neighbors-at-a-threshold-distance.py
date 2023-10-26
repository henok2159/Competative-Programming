class Solution:
    def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
        dist = [[math.inf] * n for _ in range(n)]

        for node in range(n):
            dist[node][node] = 0
        for source, dest, weight in edges:
            dist[source][dest] = weight
            dist[dest][source] = weight

        for pivot in range(n):
            for nodea in range(n):
                for nodeb in range(n):
                    trans_dist = dist[nodea][pivot] + dist[pivot][nodeb]
                    if trans_dist < dist[nodea][nodeb]:
                        dist[nodea][nodeb] = trans_dist
                        dist[nodeb][nodea] = trans_dist

        min_city, min_reach = None, math.inf
        for nodea in range(n):
            nodea_reach = 0
            for nodeb in range(n):
                if dist[nodea][nodeb] <= distanceThreshold:
                    nodea_reach += 1
            if nodea_reach <= min_reach:
                min_city = nodea
                min_reach = nodea_reach

        return min_city
        